package com.hendisantika.springbootjavafaker;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Locale;

import static com.hendisantika.springbootjavafaker.FakerUtil.getFakerObjects;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-java-faker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/12/19
 * Time: 05.52
 */
@Controller
public class FakerController {
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "ID") String locale, Model model) {
        Locale local = new Locale("id", "ID");
        model.addAttribute("locales", Arrays.asList(Locale.US.getCountry(),
                local.getCountry(),
                Locale.CHINESE.getCountry(),
                Locale.ENGLISH.getCountry(),
                Locale.JAPAN.getCountry(),
                Locale.KOREA.getCountry(),
                Locale.FRANCE.getCountry(),
                Locale.GERMANY.getCountry()));

        Faker faker = new Faker(new Locale(locale));
        model.addAttribute("values", getFakerObjects(faker));
        return "faker.html";
    }
}