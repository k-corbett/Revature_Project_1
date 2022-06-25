import Models.User;
import Repos.UserDAO;
import Services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTests {
    @InjectMocks
    private static UserService mockUs;

    @Mock
    private static UserDAO mockUd;


    @Test
    public void should_loginUser(){
        //given
        User mock = new User(1, "beaulionettem9", "thaddeus");
        //when
        when(mockUd.getUserByUsername("beaulionettem9")).thenReturn(mock);
        //then
        assertEquals(mock, mockUs.loginUser("beaulionettem9", "thaddeus"));
    }
}