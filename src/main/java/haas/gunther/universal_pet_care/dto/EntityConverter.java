package haas.gunther.universal_pet_care.dto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EntityConverter<T, U> {

    private final ModelMapper modelMapper;

    public U mapEntityToDto(T entity, Class<U> dtoClass) {
        return modelMapper.map(entity, dtoClass);
    }

    public T mapDtoToEntity(U dto, Class<T> entityClass) {
        return modelMapper.map(dto, entityClass);
    }

    
}
