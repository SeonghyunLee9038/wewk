package com.wewk.mapStruct;

import org.mapstruct.MappingTarget;

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

    default T updateEntity(U dto, @MappingTarget T entity) {
        return toEntity(dto, entity);
    }

    default U updateDto(T entity, @MappingTarget U dto) {
        return toDto(entity, dto);
    }

    List<T> toEntityList(List<U> dtoList);

    List<U> toDtoList(List<T> entityList);


}
