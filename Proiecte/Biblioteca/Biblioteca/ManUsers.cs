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
    public partial class ManUsers : Form
    {
        public ManUsers()
        {
            InitializeComponent();
        }
        static string constring = @"server=localhost;user id=root;database=users;password=1997williAM";
        static MySqlConnection cnn = new MySqlConnection(constring);

        public void disp_data()
        {
            MySqlCommand cmd = new MySqlCommand("SELECT * FROM users", cnn);

            try
            {
                MySqlDataAdapter sda = new MySqlDataAdapter(cmd);
                sda.SelectCommand = cmd;
                DataTable  dt = new DataTable();

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

        private void ManUsers_Load(object sender, EventArgs e)
        {
            disp_data();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            cnn.Open();
            MySqlCommand cmd = cnn.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "delete from users where Username='" + textBox1.Text + "'";
            cmd.ExecuteNonQuery();
            cnn.Close();
            MessageBox.Show("User deleted succesfully");
            disp_data();
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }
    }
}
