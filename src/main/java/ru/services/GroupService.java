package ru.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.domen.Group;
import ru.repos.GroupRepository;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public void saveGroup(Group user) {
        groupRepository.save(user);
    }

    public Group getGroupById(Long id) {
        return groupRepository.findById(id).get();
    }

    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }

    public List<Group> search(String name) {
        return groupRepository.findByName(name);
    }

}