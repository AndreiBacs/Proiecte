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
    public partial class RegisterF : Form
    {
        private MySqlCommand cmd1, cmd;
        private MySqlDataAdapter da;
        private DataTable dt;
        private DataSet ds = new DataSet();

        public RegisterF()
        {
            InitializeComponent();
        }

        private void textBox6_TextChanged(object sender, EventArgs e)
        {

        }

        private void RegisterF_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "" || textBox2.Text == "" || textBox3.Text == "" || textBox4.Text == "" ||
                textBox5.Text == "" || textBox6.Text == "" || textBox7.Text == "")
            {
                label9.Text="All fields must be completed";
               
            }
            else
            {
                string connetionString = null;
                MySqlConnection cnn;
                connetionString = @"server=localhost;user id=root;database=users;password=1997williAM";
                cnn = new MySqlConnection(connetionString);

                cmd1 = new MySqlCommand("SELECT * FROM users WHERE Username='" + textBox3.Text+"'",cnn);
                MySqlDataAdapter da = new MySqlDataAdapter(cmd1);
                da.Fill(ds);
                int i = ds.Tables[0].Rows.Count;
                if (i > 0)
                {
                    MessageBox.Show("Username already exists ");
                    ds.Clear();
                }
                else
                {
                    try
                    {

                        cnn.Open();
                        string sql = "INSERT INTO users(FirstName,LastName,Username,Password,Age,Email,Phone) VALUES('" +
                                     textBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "','" +
                                     textBox4.Text + "','" +
                                     textBox5.Text + "','" + textBox6.Text + "','" + textBox7.Text + "')";
                        MySqlCommand cmd = new MySqlCommand(sql, cnn);
                        cmd.ExecuteNonQuery();
                        MessageBox.Show("User is registered!");
                        cnn.Close();
                    }
                    catch (Exception ex)
                    {
                        MessageBox.Show(ex.Message);
                    }
                    /* string connetionString = null;
                     MySqlConnection cnn;
                     connetionString = "server=127.0.0.1;database=biblioteca;uid=root;pwd=Alex26;";
                     cnn = new MySqlConnection(connetionString);
        
                         cnn.Open();
                   string sql= "INSERT INTO users(Nume, Prenume,Numecont,Parola,Varsta,Email, Telefon) VALUES('" +
                               textBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "','" + textBox4.Text + "','" +
                               textBox5.Text + "','" + textBox6.Text + "','" + textBox7.Text + "')";
                     MySqlCommand cmd = new MySqlCommand(sql,cnn);
                     cmd.ExecuteNonQuery();
                     MessageBox.Show("User is registered!");*/
                }
            }
        }
    }
}
