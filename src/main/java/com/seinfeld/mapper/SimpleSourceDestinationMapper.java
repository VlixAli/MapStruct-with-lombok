package com.seinfeld.mapper;

import com.seinfeld.dto.SimpleDestination;
import com.seinfeld.entity.SimpleSource;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}
