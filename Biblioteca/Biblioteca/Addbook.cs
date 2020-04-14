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
    public partial class Addbook : Form
    {


        public Addbook()
        {
            InitializeComponent();
        }

        // private MySqlConnection con = new MySqlConnection(@"server=127.0.0.1;database=biblioteca;uid=root;pwd=Alex26;");
        private void button1_Click(object sender, EventArgs e)
        {
            /* con.Open();
             string qry = "INSERT INTO books(Titlu,Autor,Editura,ISBN,`Numar exemplare`,Categorie) VALUES('" +
                          textBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "','" + textBox4.Text + "','" +
                          textBox5.Text + "','" + textBox6.Text + "')";
             MySqlDataAdapter sa = new MySqlDataAdapter(qry, con);
             sa.SelectCommand.ExecuteNonQuery();
             con.Close();
             MessageBox.Show("Book added");*/


            if (textBox1.Text == "" || textBox2.Text == "" || textBox3.Text == "" || textBox4.Text == "" ||
                textBox5.Text == "" || textBox6.Text == "")
            {
                label7.Text = "You forgot some fields!";

            }
            else
            {

                string constring = @"server=localhost;user id=root;database=users;password=1997williAM;";
                MySqlConnection cnn = new MySqlConnection(constring);

                MySqlCommand cmd1 = new MySqlCommand("SELECT * FROM books WHERE Title='" + textBox1.Text + "'", cnn);
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


                    MemoryStream ms = new MemoryStream();
                    pictureBox1.Image.Save(ms, pictureBox1.Image.RawFormat);
                    byte[] img = ms.ToArray();


                    MySqlCommand cmd = new MySqlCommand(
                        "INSERT INTO books(Title,Author,Publisher,ISBN,NumberofCopies,Category,Picture) VALUES('" +
                        textBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "','" +
                        textBox4.Text + "','" + textBox5.Text + "','" + textBox6.Text + "', '"+img+"');", cnn);
                    MySqlDataReader myReader;
                    try
                    {
                        cnn.Open();
                        myReader = cmd.ExecuteReader();
                        MessageBox.Show("Book added to library!");
                        while (myReader.Read())
                        {
                        }

                    }
                    catch (Exception ex)
                    {
                        MessageBox.Show(ex.Message);
                    }
                }
            }
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            OpenFileDialog opf = new OpenFileDialog();
            opf.Filter= "Choose Image(*.jpg; *.png; *.gif)|*.jpg;*.png;*.gif";
            if (opf.ShowDialog() == DialogResult.OK)
            {
                pictureBox1.Image = Image.FromFile(opf.FileName);
            }
        }

        private void Addbook_Load(object sender, EventArgs e)
        {

        }
    }
}     
        
    

    
