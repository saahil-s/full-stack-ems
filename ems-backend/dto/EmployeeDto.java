package net.javaguides.ems.dto;
// This class is used to transfer the data between client and server.
// When we build the REST services, this class will be a response for REST apis.
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    public EmployeeDto() {
        id = 0L;
        firstName="";
        lastName="";
        email="";
    }
}
