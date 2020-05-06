using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using MySql.Data.MySqlClient;
using System.IO;

namespace Biblioteca
{
    public partial class SearchBook : Form
    {
        int a,id;
        public SearchBook()
        {
            InitializeComponent();
        }
        public SearchBook(string param)
        {
            InitializeComponent();
            id = Int32.Parse(param);

        }

        DataTable dt = new DataTable();

        public void disp_data()
        {

            string connString = null;
            MySqlConnection cnn;
            connString = @"server=localhost;user id=root;database=users;password=1997williAM";
            cnn = new MySqlConnection(connString);
            MySqlCommand cmd = new MySqlCommand("SELECT * FROM books", cnn);

            try
            {
                MySqlDataAdapter sda = new MySqlDataAdapter(cmd);
                sda.SelectCommand = cmd;
                // DataTable dt = new DataTable();

                dataGridView1.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.Fill;
                dataGridView1.RowTemplate.Height = 120;



                dataGridView1.AllowUserToAddRows = true;
                sda.Fill(dt);
                BindingSource bSource = new BindingSource();

                bSource.DataSource = dt;
                dataGridView1.DataSource = bSource;


                sda.Update(dt);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }


        private void button1_Click(object sender, EventArgs e)
        {


            /* string connString = null;
             MySqlConnection cnn;
             connString = "server=127.0.0.1;database=biblioteca;uid=root;pwd=Alex26;";
             cnn = new MySqlConnection(connString);
             try
             {
                 cnn.Open();
                 MySqlCommand cmd = cnn.CreateCommand();
                 cmd.CommandType = CommandType.Text;
                 cmd.CommandText = "select * from books where Titlu like  %'" + textBox1.Text + "'%";
                 MySqlDataReader myReader = null;
                 myReader = cmd.ExecuteReader();
                 while (myReader.Read())
                 {

                     textBox2.Text = myReader["Autor"].ToString();
                     textBox3.Text = myReader["Editura"].ToString();
                     textBox4.Text = myReader["ISBN"].ToString();
                     textBox5.Text = myReader["Numar exemplare"].ToString();
                    // textBox7.Text = myReader["Categorie"].ToString();

                 }

                 DataTable table = new DataTable();
                 MySqlDataAdapter da = new MySqlDataAdapter();
                 da.Fill(table);
                 byte[] img = (byte[]) table.Rows[0][6];
                 MemoryStream ms = new MemoryStream(img);
                 pictureBox1.Image = Image.FromStream(ms);
                 da.Dispose();
                 cnn.Close();
             }
             catch (Exception ex)
             {
                 MessageBox.Show(ex.ToString());
             }

         */
        }

        private void SearchBook_Load(object sender, EventArgs e)
        {
            disp_data();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

            var bd = (BindingSource) dataGridView1.DataSource;
            var dt = (DataTable) bd.DataSource;
            // var dt = (DataTable) dataGridView1.DataSource;
            dt.DefaultView.RowFilter = string.Format("Title like '%{0}%'", textBox1.Text.Trim().Replace("'", "''"));
            dataGridView1.Refresh();
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            var bd = (BindingSource) dataGridView1.DataSource;
            var dt = (DataTable) bd.DataSource;
            // var dt = (DataTable) dataGridView1.DataSource;
            dt.DefaultView.RowFilter = string.Format("Author like '%{0}%'", textBox2.Text.Trim().Replace("'", "''"));
            dataGridView1.Refresh();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

            DataView dv = new DataView(dt);
            if (comboBox1.SelectedItem.ToString() == "All")
            {
                dataGridView1.DataSource = dt;

            }
            else
            {
                dv.RowFilter = string.Format("Category LIKE '%{0}%'", comboBox1.SelectedItem.ToString());
                dataGridView1.DataSource = dv;
            }


        }





        /*   private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
            {
                if (e.RowIndex >= 0)
                {
                    DataGridViewRow row = this.dataGridView1.Rows[e.RowIndex];
                    textBox1.Text = row.Cells["Titlu"].Value.ToString();
                    textBox2.Text = row.Cells["Autor"].Value.ToString();
                    textBox3.Text = row.Cells["Editura"].Value.ToString();
                    textBox4.Text = row.Cells["ISBN"].Value.ToString();
                    textBox5.Text = row.Cells["Numar exemplare"].Value.ToString();
                    comboBox1.Text = row.Cells["Categorie"].Value.ToString();
                    textBox6.Text = row.Cells["idB"].Value.ToString();
                }
            }*/

       



        private void button4_Click(object sender, EventArgs e)
        {

            string constring = @"server=localhost;user id=root;database=users;password=1997williAM";
            MySqlConnection cnn = new MySqlConnection(constring);

            MySqlCommand cmd1 = new MySqlCommand("SELECT * FROM books WHERE Title='" + textBox7.Text + "'", cnn);
            MySqlDataAdapter da = new MySqlDataAdapter(cmd1);
            DataSet ds = new DataSet();

            da.Fill(ds);
            int i = ds.Tables[0].Rows.Count;
            if (i > 0)
            {
                MessageBox.Show("Book already exists ");
                ds.Clear();
            }
            else
            {
            }

            MySqlCommand cmd = new MySqlCommand(
                "INSERT INTO carti_cerute(title) VALUES('" + textBox7.Text + "');", cnn);
            MySqlDataReader myReader;
            try
            {
                cnn.Open();
                myReader = cmd.ExecuteReader();
                MessageBox.Show("Thank you! We will consider your request!");
                while (myReader.Read())
                {
                }

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button5_Click(object sender, EventArgs e)
        
            {
                string constring = @"server=localhost;user id=root;database=users;password=1997williAM";
                MySqlConnection cnn = new MySqlConnection(constring);
                cnn.Open();
             
                MySqlCommand cmd1 = cnn.CreateCommand();
                cmd1.CommandType = CommandType.Text;
                cmd1.CommandText = "INSERT INTO borrowed(idB,idUsers) VALUES('"+a+"', '"+id+"')";
                cmd1.ExecuteNonQuery();
                cnn.Close();
                MessageBox.Show("Borrowed! :)");

                disp_data();
            }
        

        public void GetUserIdByUsername()
        {
            //textBox8.Text = UserF.passingtext;
            string constring = @"server=localhost;user id=root;database=users;password=1997williAM";
            MySqlConnection cnn = new MySqlConnection(constring);
            cnn.Open();
            MySqlCommand cmd = cnn.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "SELECT idUsers FROM users WHERE Username LIKE '%+textbox8.Text+%'  ";
            cmd.ExecuteNonQuery();

        }

       /* private void button6_Click(object sender, EventArgs e)
        {
            string constring = @"server=localhost;user id=root;database=users;password=1997williAM";
            MySqlConnection cnn = new MySqlConnection(constring);
            cnn.Open();
            MySqlCommand cmd = cnn.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "UPDATE books SET 'NumberofCopies'='NumberofCopies' - 1 WHERE idB='" + textBox6.Text +
                              "'";
            cmd.ExecuteNonQuery();

            MySqlCommand cmd1 = cnn.CreateCommand();
            cmd1.CommandType = CommandType.Text;
            cmd1.CommandText =
                "INSERT INTO borrowed(idB,idU) VALUES(textBox6.getText, GetUserIdByUsername(textBox8.getText)";
            cmd1.ExecuteNonQuery();
            cnn.Close();
            MessageBox.Show("Borrowed! :)");

            disp_data();
        }
        */
        private void dataGridView1_SelectionChanged(object sender, EventArgs e)
        {
            dataGridView1.Refresh();
            DataGridViewCell cell = null;
            foreach (DataGridViewCell selectedCell in dataGridView1.SelectedCells)
            {
                cell = selectedCell;
                break;
            }
            if (cell != null)
            {
                DataGridViewRow row = cell.OwningRow;
                textBox1.Text = row.Cells["Title"].Value.ToString();
                textBox2.Text = row.Cells["Author"].Value.ToString();
                textBox3.Text = row.Cells["Publisher"].Value.ToString();
                textBox4.Text = row.Cells["ISBN"].Value.ToString();
                textBox5.Text = row.Cells["NumbarofCopies"].Value.ToString();
                textBox6.Text = row.Cells["idB"].Value.ToString();
                //textBox8.Text = row.Cells["idUsers"].Value.ToString();
                comboBox1.Text = row.Cells["Category"].Value.ToString();


            }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            var items = Convert.ToInt32(dataGridView1.Rows[e.RowIndex].Cells[6].Value);
           // MessageBox.Show(items.ToString());
            a = items;
            

        }

        private void textBox6_TextChanged(object sender, EventArgs e)
        {

        }





        /* private void dataGridView1_MouseDoubleClick(object sender, MouseEventArgs e)
         {
             textBox1.Text = dataGridView1.SelectedRows[0].Cells[1].Value.ToString();
             textBox2.Text = dataGridView1.SelectedRows[0].Cells[2].Value.ToString();
             textBox3.Text = dataGridView1.SelectedRows[0].Cells[3].Value.ToString();
             textBox4.Text = dataGridView1.SelectedRows[0].Cells[4].Value.ToString();
             textBox5.Text = dataGridView1.SelectedRows[0].Cells[5].Value.ToString();
             comboBox1.Text = dataGridView1.SelectedRows[0].Cells[6].Value.ToString();
         }*/
    }
}



    