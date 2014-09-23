/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.domain;

import in.ac.sbps.util.SClass;
import in.ac.sbps.util.Section;
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
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @TableGenerator(name = "studentIdGenerator", table = "ID_GENERATOR", pkColumnName = "PK_NAME", pkColumnValue = "STUDENT_ID", valueColumnName = "PK_VALUE")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "studentIdGenerator")
    private Long id;
    
    @Column(name = "FIRST_NAME")
    private String firstName;
    
    @Column(name = "LAST_NAME")
    private String lastName;
    
    @Column(name = "FATHER_NAME")
    private String fatherName;
    
    @Column(name = "MOTHER_NAME")
    private String motherName;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "STU_CLASS")
    private SClass stuClass;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "STU_SECTION")
    private Section section;
    
    @Column(name = "VILLAGE")
    private String village;
    
    public Student() { }
    
    public Student(String firstName, String lastName, String fatherName, 
            String motherName, String village) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.village = village;
    }
    
    public Student(String firstName, String lastName, String fatherName, 
            String motherName, String sClass, String section, String village) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.stuClass = SClass.classValueOf(sClass);
        this.section = Section.sectionValueOf(section);
        this.village = village;
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public SClass getStuClass() {
        return stuClass;
    }

    public void setStuClass(SClass stuClass) {
        this.stuClass = stuClass;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
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
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.ac.sbps.domain.Student[ id=" + id + " ]";
    }
    
}
