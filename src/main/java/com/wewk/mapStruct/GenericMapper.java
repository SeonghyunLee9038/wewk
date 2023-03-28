package com.wewk.mapStruct;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

public interface GenericMapper <T, U> {
    U toDto(T entity);
    T toEntity(U dto);


    default U toDto(T entity, @MappingTarget U dto) {
        return toDto(entity);
    }

    default T toEntity(U dto, @MappingTarget T entity) {
        return toEntity(dto);
    }

    void updateEntityForAll(U dto, @MappingTarget T entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityForNotNull(U dto, @MappingTarget T entity);

    List<T> toEntityList(List<U> dtoList);

    List<U> toDtoList(List<T> entityList);



}
