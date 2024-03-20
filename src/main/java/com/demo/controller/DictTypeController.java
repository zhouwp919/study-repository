package com.demo.controller;

import com.demo.dto.DictTypeDTO;
import com.demo.service.DictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/distType" )
public class DictTypeController {
    @Autowired
    private DictTypeService dictTypeService;
    @PostMapping("/item")
    public ResponseEntity<DictTypeDTO> update(@RequestBody DictTypeDTO dto) {
        return new ResponseEntity<>(dictTypeService.getItemById(dto.getId()), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<DictTypeDTO> save(@RequestBody DictTypeDTO dto) {
        return new ResponseEntity<>(dictTypeService.save(dto), HttpStatus.OK);
    }
    @PostMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody DictTypeDTO dto) {
        dictTypeService.deleteById(dto.getId());
        return new ResponseEntity<>("删除成功", HttpStatus.OK);
    }
}
