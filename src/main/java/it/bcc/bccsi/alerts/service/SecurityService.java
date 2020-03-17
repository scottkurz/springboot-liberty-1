package it.bcc.bccsi.alerts.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
