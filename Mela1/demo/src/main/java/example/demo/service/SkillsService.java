
package example.demo.service;

import example.demo.model.Skills;
import example.demo.repository.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {

    @Autowired
    private SkillsRepo skillsRepo;

    public List<Skills> getAllSkills() {
        return skillsRepo.findAll();
    }

    public Skills addSkill(Skills skill) {
        return skillsRepo.save(skill);
    }

    public void deleteSkill(Long id) {
        skillsRepo.deleteById(id);
    }
}

