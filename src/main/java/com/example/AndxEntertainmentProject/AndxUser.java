package com.example.AndxEntertainmentProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

// equivalent to a C++ struct
// custom data type for database
@Entity
public class AndxUser
{
    /*************************************************
     * DATA MEMBERS
     *************************************************/
    @Id @GeneratedValue
    private Long id; // forms primary key
    private String first_name;
    private String surname;
    private String DOB;
    private String username;
    private String password;
    private int privilege_level; // correlate an account type with privileges in a new method

    /*************************************************
     * ACCESSORS & MUTATORS
     *************************************************/
    public String getFirst_name()
        {
            return first_name;
        }

    public void setFirst_name(String first_name)
        {
            this.first_name = first_name;
        }

    public String getSurname()
        {
            return surname;
        }

    public void setSurname(String surname)
        {
            this.surname = surname;
        }

    public String getDOB()
        {
            return DOB;
        }

    public void setDOB(String DOB)
        {
            this.DOB = DOB;
        }

    public void setId(Long id)
        {
            this.id = id;
        }

    public Long getId()
        {
            return id;
        }


    /*************************************************
     * OTHER MEMBERS
     *************************************************/

    @Override
    public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            AndxUser user = (AndxUser) o;
            return Objects.equals(id, user.id) &&
                    Objects.equals(first_name, user.first_name) &&
                    Objects.equals(surname, user.surname) &&
                    Objects.equals(DOB, user.DOB) &&
                    Objects.equals(username, user.username) &&
                    Objects.equals(password, user.password) &&
                    Objects.equals(privilege_level, user.privilege_level);
        }

        // prevents collisions when pushing data into ADT tables
     @Override
     public int hashCode()
         {
             return Objects.hash(id, first_name, surname, DOB, username, password, privilege_level);
         }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + first_name + '\'' +
                ", lastName='" + surname + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }
}
