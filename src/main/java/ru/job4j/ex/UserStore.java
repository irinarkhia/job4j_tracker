package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User founded = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                founded = user;
            }
        }
        if (founded == null) {
            throw new UserNotFoundException("Элемент не найден");
        }
        return founded;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Элемент является недействительным");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            validate(user);
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException em) {
            em.printStackTrace();
        } catch (Exception es) {
        }
    }
}
