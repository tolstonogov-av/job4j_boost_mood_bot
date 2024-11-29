package ru.job4j.bmb.services;

import org.springframework.stereotype.Service;
import ru.job4j.bmb.repositories.AchievementRepository;
import ru.job4j.bmb.repositories.MoodLogRepository;
import ru.job4j.bmb.repositories.UserRepository;
import ru.job4j.bmb.services.TelegramBotService;

@Service
public class AchievementService {
    TelegramBotService telegramBotService;

    UserRepository userRepository;

    MoodLogRepository moodLogRepository;

    AchievementRepository achievementRepository;
}
