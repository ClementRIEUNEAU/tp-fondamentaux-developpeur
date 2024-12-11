import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.Employee;

public class EmployeeTest {

    @Test
    public void testValidConstructor() {
        Employee faker = new Employee("Faker", 1, "CEO");
        assertEquals("Faker", faker.getNom());
        assertEquals(1, faker.getId());
        assertEquals("CEO", faker.getPosition());
    }

    @Test
    public void testInvalidConstructorNomVide() {
        assertThrows(IllegalArgumentException.class, () -> { Employee nomVide = new Employee("", 1, "CEO"); });
    }

    @Test
    public void testInvalidConstructorNomNull() {
        assertThrows(IllegalArgumentException.class, () -> { Employee nomNull = new Employee(null, 1, "CEO"); });
    }

    @Test
    public void testInvalidConstructorIdNegatif() {
        assertThrows(IllegalArgumentException.class, () -> { Employee idNegatif = new Employee("Faker", -1, "CEO"); });
    }
}
