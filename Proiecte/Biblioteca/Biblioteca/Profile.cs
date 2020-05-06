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
    public partial class Profile : Form
    {


        public Profile()
        {
            InitializeComponent();

        }


        private void button1_Click(object sender, EventArgs e)
            {
                string connetionString = null;
                MySqlConnection con;
                connetionString = @"server=localhost;user id=root;database=users;password=1997williAM";
                con = new MySqlConnection(connetionString);

            
                    con.Open();
            try
            {

                MySqlCommand myCommand = new MySqlCommand();
                    myCommand.Connection = con;
                    myCommand.CommandText = "UPDATE users  SET FirstName='" + textBox1.Text + "',LastName='" + textBox2.Text +
                                            "',Password='" + textBox4.Text + "',Age=" + int.Parse(textBox5.Text)+
                                            ",Email='" + textBox6.Text + "',Phone='" + textBox7.Text + "' WHERE Username='" + textBox3.Text + "'";
                if (myCommand.ExecuteNonQuery() == 1)
                   {
                        MessageBox.Show("DATA UPDATED!");
                    }
                    else
                    {
                        MessageBox.Show("Data not updated");
                    }
                    con.Close();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.ToString());
            }}

            private void Profile_Load(object sender, EventArgs e)
            {
                textBox3.Text = UserF.passingtext;
                string connString = null;
                MySqlConnection cnn;
                connString = @"server=localhost;user id=root;database=users;password=1997williAM";
                cnn = new MySqlConnection(connString);
                try
                {
                    cnn.Open();
                    MySqlCommand cmd = cnn.CreateCommand();
                    cmd.CommandType = CommandType.Text;
                    cmd.CommandText = "select * from users where Username='" + textBox3.Text + "'";
                    MySqlDataReader myReader = null;
                    myReader = cmd.ExecuteReader();
                    while (myReader.Read())
                    {
                        textBox1.Text = myReader["FirstName"].ToString();
                        textBox2.Text = myReader["LastName"].ToString();
                        textBox4.Text = myReader["Password"].ToString();
                        textBox5.Text = myReader["Age"].ToString();
                        textBox6.Text = myReader["Email"].ToString();
                        textBox7.Text = myReader["Phone"].ToString();

                    }
                    cnn.Close();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.ToString());
                }
            }

    }


}
    



