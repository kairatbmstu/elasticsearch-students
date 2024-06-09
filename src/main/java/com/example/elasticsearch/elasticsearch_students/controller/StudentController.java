package com.example.elasticsearch.elasticsearch_students.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.elasticsearch.elasticsearch_students.domain.Student;
import com.example.elasticsearch.elasticsearch_students.repository.ElasticsearchService;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    
    @Autowired
    ElasticsearchService elasticsearchService;

    @PostMapping
    @ResponseBody
    public String createStudent(@RequestBody Student student) throws IOException{
        student.setId(UUID.randomUUID());
        student.setCreateDate(LocalDateTime.now().toString());
        student.setContent("{\"errCode\":0,\"errMsg\":null,\"data\":[{\"code_sale_region\":1,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"0\",\"supply_block_reason\":-25,\"block_text\":\"~Неопределено~\",\"filial_list\":\"АФ1,АФ10,АФ11,АФ12,АФ14,АФ19,АФ2,АФ20,АФ21,АФ22,АФ23,АФ24,АФ25,АФ3,АФ30,АФ34,АФ35,АФ37,АФ39,АФ4,АФ40,АФ42,АФ44,АФ48,АФ51,АФ57,АФ58,АФ59,АФ6,АФ61,АФ62,АФ63,АФ65,АФ68,АФ69,АФ7,АФ70,АФ71,АФ72,АФ73,АФ74,АФ76,АФ8,АФ81,АФ84,АФ9,КПФ1,ФКС1,АФ45,АФ60\",\"assType\":\"Регулярный\"},{\"code_sale_region\":1,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"1\",\"supply_block_reason\":2621,\"block_text\":\"Отсутствует в планограмме\",\"filial_list\":\"АФ15,АФ16,АФ17,АФ18,АФ26,АФ28,АФ29,АФ31,АФ32,АФ33,АФ36,АФ38,АФ41,АФ43,АФ47,АФ49,АФ50,АФ52,АФ54,АФ64,АФ66,АФ67,ФКС2,АФ53,АФ56,ЕКФ1\",\"assType\":\"Регулярный\"},{\"code_sale_region\":1,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"1\",\"supply_block_reason\":3150,\"block_text\":\"Филиал не работает\",\"filial_list\":\"АФ13,АФ5,АФ79,АФ85\",\"assType\":\"Регулярный\"},{\"code_sale_region\":1,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"1\",\"supply_block_reason\":3210,\"block_text\":\"По инициативе ДУЗ\",\"filial_list\":\"АФ75,АФ78,АФ80,АФ83\",\"assType\":\"Регулярный\"},{\"code_sale_region\":4,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"0\",\"supply_block_reason\":-25,\"block_text\":\"~Неопределено~\",\"filial_list\":\"ШФ1,ШФ10,ШФ13,ШФ14,ШФ15,ШФ17,ШФ2,ШФ23,ШФ24,ШФ25,ШФ26,ШФ27,ШФ28,ШФ29,ШФ3,ШФ30,ШФ33,ШФ4,ШФ7,ШФ9\",\"assType\":\"Регулярный\"},{\"code_sale_region\":4,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"1\",\"supply_block_reason\":2621,\"block_text\":\"Отсутствует в планограмме\",\"filial_list\":\"ШФ12,ШФ20,ШФ21,ШФ34,ШФ5,ШФ6,ШФ8\",\"assType\":\"Регулярный\"},{\"code_sale_region\":4,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"1\",\"supply_block_reason\":3150,\"block_text\":\"Филиал не работает\",\"filial_list\":\"ШФ18,ШФ19,ШФ22,ШФ31,ШФ32\",\"assType\":\"Регулярный\"},{\"code_sale_region\":5,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"0\",\"supply_block_reason\":-25,\"block_text\":\"~Неопределено~\",\"filial_list\":\"ТКФ1,ТКФ2\",\"assType\":\"Регулярный\"},{\"code_sale_region\":737,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"0\",\"supply_block_reason\":-25,\"block_text\":\"~Неопределено~\",\"filial_list\":\"КЗФ1\",\"assType\":\"Регулярный\"},{\"code_sale_region\":737,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"1\",\"supply_block_reason\":1883,\"block_text\":\"Запрет по письму поставщика\",\"filial_list\":\"КЗФ2\",\"assType\":\"Регулярный\"},{\"code_sale_region\":795,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"0\",\"supply_block_reason\":-25,\"block_text\":\"~Неопределено~\",\"filial_list\":\"ТЗФ1\",\"assType\":\"Регулярный\"},{\"code_sale_region\":795,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"1\",\"supply_block_reason\":2621,\"block_text\":\"Отсутствует в планограмме\",\"filial_list\":\"ТЗФ2\",\"assType\":\"Регулярный\"},{\"code_sale_region\":795,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"1\",\"supply_block_reason\":3150,\"block_text\":\"Филиал не работает\",\"filial_list\":\"ТЗФ10,ТЗФ3,ТЗФ4,ТЗФ5,ТЗФ6\",\"assType\":\"Регулярный\"},{\"code_sale_region\":1197,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"0\",\"supply_block_reason\":-25,\"block_text\":\"~Неопределено~\",\"filial_list\":\"ТФ1,ТФ2,ТФ4\",\"assType\":\"Регулярный\"},{\"code_sale_region\":1197,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"1\",\"supply_block_reason\":2621,\"block_text\":\"Отсутствует в планограмме\",\"filial_list\":\"ТФ3\",\"assType\":\"Регулярный\"},{\"code_sale_region\":1456,\"number_supplagr_register\":505431,\"code_wares\":364120,\"is_supply_block\":\"0\",\"supply_block_reason\":-25,\"block_text\":\"~Неопределено~\",\"filial_list\":\"УКФ1,УКФ2,УКФ3\",\"assType\":\"Регулярный\"}]}\n" + //
                        "2024-05-25 17:17:55.580  INFO 1        --- [nio-8080-exec-4] o.Ok");
        elasticsearchService.indexDocument("students", student.getId().toString(), student);
        return "ok";
    }
    

}
