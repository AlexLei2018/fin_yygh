package com.alex.yygh.hosp.controller;

import com.alex.yygh.hosp.mapper.HospitalSetMapper;
import com.alex.yygh.hosp.service.HospitalSetService;
import com.alex.yygh.model.hosp.HospitalSet;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {
    @Autowired
    private HospitalSetService hospitalSetService;

    //http://localhost:8201//admin/hosp/hospitalSet/findAll
    @ApiOperation(value = "acquire all info")
    @GetMapping("findAll")
    public List<HospitalSet> findAllHospitalSet() {
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }

    @ApiOperation(value = "logic delete hosp info")
    @DeleteMapping("{id}")
    public boolean removeHospSet(@PathVariable Long id) {
        boolean flag = hospitalSetService.removeById(id);
        return flag;
    }
}
