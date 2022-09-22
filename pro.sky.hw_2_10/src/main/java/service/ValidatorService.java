package service;

import exeption.InvalidNameException;
import exeption.InvalidSurnameException;
import model.Employee;
import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.buf.StringUtils;
import org.springfremework.stereotype.Service;

@Service

public class ValidatorService {
    public Employee validateEmployee(String name,
                                     String surname,
                                     int department,
                                     double salary) {
        if (!StringUtils.isAlpha(name)) {
            throw new InvalidNameException();
        }
        if (!StringUtils.isAlpha(surname)){
            throw new InvalidSurnameException();
        }
        Employee employee = new Employee(
                StringUtils.capitalize(name.toLowerCase()),
                StringUtils.capitalize(surname.toLowerCase()),
                department,
                salary
        );
        return employee;
    }
}
