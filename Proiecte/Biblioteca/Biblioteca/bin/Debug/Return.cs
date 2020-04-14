using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace Biblioteca
{
    public partial class Return : Form
    {
        string id;
        public Return()
        {
            InitializeComponent();
        }
        public Return(string param)
        {
            InitializeComponent();
            id = param;
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private DataTable dt = new DataTable();
        public void disp_data()
        {

            string connString = null;
            MySqlConnection cnn;
            connString = @"server=localhost;user id=root;database=users;password=1997williAM";
            cnn = new MySqlConnection(connString);
            MySqlCommand cmd = new MySqlCommand("SELECT  users.FirstName,users.LastName,books.Title,borrowed.idB FROM borrowed JOIN books on borrowed.idB = books.idB JOIN users on users.idUsers = borrowed.idUsers WHERE users.idUsers = '" + id+"'", cnn);
            
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

        private void Return_Load(object sender, EventArgs e)
        {
            disp_data();
        }

        private void button1_Click(object sender, EventArgs e)
        {

            string connString = null;
            MySqlConnection cnn;
            connString = @"server=localhost;user id=root;database=users;password=1997williAM";
            cnn = new MySqlConnection(connString);
            cnn.Open();
            MySqlCommand cmd = cnn.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "delete from borrowed where idB='" + textBox1.Text + "'and idUsers='"+id+"'";
            cmd.ExecuteNonQuery();
            cnn.Close();
            MessageBox.Show("Request deleted succesfully");
            disp_data(); 
        }
    }
}
