package com.cloudbest.cloud.feign;

import com.cloudbest.cloud.api.ProviderFeignApi;
import com.cloudbest.cloud.constant.AppConstant;
import org.springframework.cloud.openfeign.FeignClient;



//@FeignClient(value = "cloudbest-provider-service")
@FeignClient(value = AppConstant.CLOUDBEST_PROVIDER_SERVICE,fallback = ProviderFeignHystrixServiceImpl.class)
public interface ProviderFeignService extends ProviderFeignApi {

}
