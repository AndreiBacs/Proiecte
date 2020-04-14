using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Biblioteca
{
    public partial class Form5 : Form
    {
        string id;
        public Form5()
        {
            InitializeComponent();
           
        }
        public Form5(string a)
        {
            InitializeComponent();
            id = a;

        }
        

        private void button1_Click(object sender, EventArgs e)
        {
            SearchBook sb = new SearchBook(id); // Instantiate a Form3 object.
            sb.Show();
        }

        private void Form5_Load(object sender, EventArgs e)
        {
           
        }

        private void button4_Click(object sender, EventArgs e)
        {
            {
                Profile prof = new Profile();
                prof.Show();
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Return rb = new Return(id);
            rb.Show();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            try
            {
                foreach (Form f in Application.OpenForms.Cast<Form>().ToList())
                {
                    if (f.Name != "UserF")
                    {
                        f.Close();
                        new UserF().Show();
                    }
                }
            }

            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
