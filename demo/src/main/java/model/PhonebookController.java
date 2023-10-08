package model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class PhonebookController {

    private final ContactStorageStrategy storageStrategy;

    @Autowired
    public PhonebookController(ContactStorageStrategy storageStrategy) {
        this.storageStrategy = storageStrategy;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Contact> contacts = storageStrategy.getAllContacts();
        model.addAttribute("contacts", contacts);
        return "index";
    }

    @PostMapping("/addContact")
    public String addContact(@RequestParam String name, @RequestParam String phoneNumber) {
        storageStrategy.addContact(name, phoneNumber);
        return "redirect:/";
    }
}
