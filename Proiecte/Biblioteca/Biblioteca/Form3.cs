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
    public partial class AdminF : Form
    {
        public AdminF()
        {
            InitializeComponent();
            textBox2.PasswordChar = '*';
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int i;
            string connetionString = null;
            MySqlConnection con;
            connetionString = @"server=localhost;user id=root;database=users;password=1997williAM";
            con = new MySqlConnection(connetionString);
            try
            {
                con.Open();
                MySqlCommand cmd = con.CreateCommand();
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "select * from administrator where Username='" + textBox1.Text + "' and Password='" + textBox2.Text + "'";
                cmd.ExecuteNonQuery();
                DataTable dt = new DataTable();
                MySqlDataAdapter da = new MySqlDataAdapter(cmd);
                da.Fill(dt);

                i = Convert.ToInt32(dt.Rows.Count.ToString());

                if (i == 0)
                {
                    label3.Text = "Invalid admin name or Password";
                }
                else
                {
                    this.Hide();
                    Form4 f4= new Form4();
                    f4.Show();
                }
                con.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Can not open connection ! ");
            }
        }

        private void AdminF_Load(object sender, EventArgs e)
        {

        }
    }
    }
