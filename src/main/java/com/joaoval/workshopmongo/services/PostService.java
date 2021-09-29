package com.joaoval.workshopmongo.services;

import com.joaoval.workshopmongo.domain.Post;
import com.joaoval.workshopmongo.domain.User;
import com.joaoval.workshopmongo.dto.UserDTO;
import com.joaoval.workshopmongo.repository.PostRepository;
import com.joaoval.workshopmongo.repository.UserRepository;
import com.joaoval.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}