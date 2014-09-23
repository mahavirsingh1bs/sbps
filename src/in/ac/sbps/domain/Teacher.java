/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.domain;

import in.ac.sbps.util.Education;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 *
 * @author mahavir.singh
 */
@Entity
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @TableGenerator(name = "teacherIdGenerator", table = "ID_GENERATOR", pkColumnName = "PK_NAME", pkColumnValue = "TEACHER_ID", valueColumnName = "PK_VALUE")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "teacherIdGenerator")
    private Long id;
    
    @Column(name = "FIRST_NAME")
    private String firstName;
    
    @Column(name = "LAST_NAME")
    private String lastName;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "EDUCATION")
    private Education education;
    
    @Column(name = "PERCENTAGE")
    private String percent;
    
    @Column(name = "COLLEGE")
    private String college;
    
    @Column(name = "CITY")
    private String city;

    public Teacher() { }
    
    public Teacher(String firstName, String lastName, String educ, 
            String percent, String college, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.education = Education.educationValueOf(educ);
        this.percent = percent;
        this.college = college;
        this.city = city;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teacher)) {
            return false;
        }
        Teacher other = (Teacher) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.ac.sbps.domain.Teacher[ id=" + id + " ]";
    }
    
}
