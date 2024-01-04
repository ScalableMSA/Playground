package org.scalablemsa.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.scalablemsa.user.dto.UserResponseDTO;
import org.scalablemsa.user.entity.UserEntity;
import org.scalablemsa.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService{
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public List<UserResponseDTO> getUserList(){
        List<UserEntity> userList = userRepository.findAll();
        log.info("userList 사이즈 : {}", userList.size());
        for(UserEntity user : userList){
            log.info("userinfo : {}",user.toString());
        }
        List<UserResponseDTO> response = userList.stream()
                .map(userEntity -> modelMapper.map(userEntity, UserResponseDTO.class))
                .collect(Collectors.toList());
        log.info("response 사이즈1 : {}", response.size());
        response.add(new UserResponseDTO(100,"dummy", LocalDateTime.now()));
        log.info("response 사이즈2 : {}", response.size());
        return response;
    }
}