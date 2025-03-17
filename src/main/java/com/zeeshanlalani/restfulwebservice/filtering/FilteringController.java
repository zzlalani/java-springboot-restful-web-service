package com.zeeshanlalani.restfulwebservice.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean filtering() {
        return new SomeBean("value1", "value2", "value3");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> filteringList() {
        return new ArrayList<>(List.of(
                new SomeBean("value1", "value2", "value3"),
                new SomeBean("value4", "value5", "value6"),
                new SomeBean("value7", "value8", "value9")
        ));
    }

    @GetMapping("/filtering2")
    public MappingJacksonValue filtering2() {
        SomeBean2 someBean2 = new SomeBean2("value1", "value2", "value3");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean2);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value1", "value3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }

    @GetMapping("/filtering-list2")
    public MappingJacksonValue filteringList2() {
        List<SomeBean2> beanList = new ArrayList<>(List.of(
                new SomeBean2("value1", "value2", "value3"),
                new SomeBean2("value4", "value5", "value6"),
                new SomeBean2("value7", "value8", "value9")
        ));
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(beanList);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value1", "value3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }

}
