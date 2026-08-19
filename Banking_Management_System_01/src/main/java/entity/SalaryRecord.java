package entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="salary_records")
public class SalaryRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salaryId;

    private double basicSalary;
    private double bonus;
    private double deductions;
    private double netSalary;

    @Temporal(TemporalType.DATE)
    private Date salaryDate;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    public SalaryRecord() {}

    // Getters and Setters
}
