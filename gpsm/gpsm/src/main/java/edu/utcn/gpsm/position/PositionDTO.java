package edu.utcn.gpsm.position;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class PositionDTO {
@Id
    private Integer id;
    private Date creationTime;

    private String terminalId;
    private String latitude;
    private String longitude;


    public PositionDTO(Position position){
        this.creationTime=position.getCreationTime();
        this.terminalId=position.getTerminalId();
        this.latitude=position.getLatitude();
        this.longitude=position.getLongitude();
        this.id=position.getId();
    }
    public PositionDTO()
    {}




}