package ru.dto;

import ru.domen.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupDTO {
    private Long groupId;
    private String name;
    private Long dialogId;
    private Long creatorId;
    private String Subject;
    private String imageURL;
    private String description;

    public static GroupDTO getGroupDTO(Group group) {
        GroupDTO groupDTO = new GroupDTO();
        groupDTO.dialogId = group.getDialogId();
        groupDTO.groupId = group.getGroupId();
        groupDTO.name = group.getName();
        groupDTO.creatorId = group.getCreator().getUserId();
        groupDTO.imageURL = group.getImageURL();
        groupDTO.Subject = group.getSubject().getName();
        groupDTO.description = group.getDescription();
        return groupDTO;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public static List<GroupDTO> getGroupDTO(List<Group> groups) {
        List<GroupDTO> groupDTOS = new ArrayList<>();
        for (Group g:
                groups) {
            groupDTOS.add(GroupDTO.getGroupDTO(g));
        }
        return groupDTOS;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDialogId() {
        return dialogId;
    }

    public void setDialogId(Long dialogId) {
        this.dialogId = dialogId;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }
}