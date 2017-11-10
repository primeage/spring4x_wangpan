package sample.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.smart.domain.User;
import com.smart.service.UserService;
import com.smart.service.UserServiceImpl;

public class MockMethodTest {
    UserService mockUserService = mock(UserService.class);
    UserServiceImpl mockServiceImpl = mock(UserServiceImpl.class);

    @Test
    public void testMockInterface() {
        when(mockUserService.findUserByUserName("tom")).thenReturn(new User("tom", "1234"));
        when(mockUserService.hasMatchUser("tom", "1234")).thenReturn(true);
        User user = mockUserService.findUserByUserName("tom");
        boolean isMatch = mockUserService.hasMatchUser("tom", "1234");
        assertNotNull(user);
        assertEquals(user.getUserName(), "tom");
        assertEquals(isMatch, true);
        verify(mockUserService).findUserByUserName("tom");
        verify(mockUserService).hasMatchUser("tom", "1234");
    }


    @Test
    public void testMockClass() {
        when(mockServiceImpl.findUserByUserName("tom")).thenReturn(new User("tom", "1234"));
        when(mockServiceImpl.hasMatchUser("tom", "1234")).thenReturn(true);
        User user = mockServiceImpl.findUserByUserName("tom");
        boolean isMatch = mockServiceImpl.hasMatchUser("tom", "1234");
        assertNotNull(user);
        assertEquals(user.getUserName(), "tom");
        assertEquals(isMatch, true);

        verify(mockServiceImpl).findUserByUserName("tom");
        verify(mockServiceImpl).hasMatchUser("tom", "1234");
    }


}
