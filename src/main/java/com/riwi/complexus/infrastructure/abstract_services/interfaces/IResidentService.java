package com.riwi.complexus.infrastructure.abstract_services.interfaces;

import com.riwi.complexus.api.dto.request.ResidentDto;
import com.riwi.complexus.domain.entities.ResidentEntity;
import com.riwi.complexus.infrastructure.abstract_services.CRUD.*;

public interface IResidentService extends
        Delete<Long>,
        ReadAll<ResidentEntity>,
        ReadById<ResidentEntity, Long>,
        Update<ResidentEntity, Long> {

}
