package Cpt9;

public class Teacher {


        String designation = "Teacher";
        String collegeName = "USM";

        void does(){
            System.out.println("Teacher");
        }

        protected void setDesignation(String designation){
            this.designation = designation;
        }

        protected String getCollegeName(){
            return collegeName;
        }

        protected String getDesignation(){
            return designation;
        }

        protected void setCollegeName(String collegeName){
            this.collegeName = collegeName;
        }
}
