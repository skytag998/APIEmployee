package Domain;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data
@Entity
@Table (name="EMPLOYEE")
public class Employee implements Serializable {
    private static final long serialVersionUID=1l;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_generator")
    @SequenceGenerator(name = "employee_generator", sequenceName = "EMPLOYEE_SEQUENCE", allocationSize = 1)
    @Column(name = "ID_EMPLOYEE")
    private int id;
    private String firstname;
    private String lastname;
    private Date birthdate;
    private double salary;
}
