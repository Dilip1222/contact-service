package com.contact.serviceImpl;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list=List.of(
            new Contact(1L,"dilip@gmail.com","Dilip",1001L),
            new Contact(2L,"amit@gmail.com","Amit",1002L),
            new Contact(3L,"raj@gmail.com","Raj",1003L),
            new Contact(4L,"durga@gmail.com","Durga",1004L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
