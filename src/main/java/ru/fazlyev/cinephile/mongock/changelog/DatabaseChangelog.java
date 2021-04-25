package ru.fazlyev.cinephile.mongock.changelog;

import com.github.cloudyrock.mongock.ChangeLog;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@ChangeLog
public class DatabaseChangelog {
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public DatabaseChangelog() {
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }
}
