package com.demo.service;

import com.demo.dto.DictTypeDTO;
import com.demo.entity.DictType;
import com.demo.repository.DictTypeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictTypeService<delete> {

    @Autowired
    private DictTypeRepository dictTypeRepository;
    //@Autowired
    public DictTypeDTO getItemById(Long id) {
        DictType db = dictTypeRepository.findById(id).orElse(null);
        DictTypeDTO dto = new DictTypeDTO();
        BeanUtils.copyProperties(db, dto);
        return dto;
    }
    //@Autowired
    public DictTypeDTO save(DictTypeDTO dto) {
        DictType temp = new DictType();
        BeanUtils.copyProperties(dto, temp);
        DictType db = dictTypeRepository.save(temp);
        BeanUtils.copyProperties(db, dto);
        return dto;
    }
   //@Autowired
   public void deleteById(Long id) {
       dictTypeRepository.deleteById(id);
   };


}
