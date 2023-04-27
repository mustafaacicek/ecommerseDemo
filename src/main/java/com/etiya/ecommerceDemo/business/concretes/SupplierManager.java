package com.etiya.ecommerceDemo.business.concretes;

import com.etiya.ecommerceDemo.business.abstracts.SupplierService;
import com.etiya.ecommerceDemo.business.dtos.requests.supplier.AddSupplierRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.supplier.AddSupplierResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.supplier.ListSupplierResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.supplier.SupplierDetailResponse;
import com.etiya.ecommerceDemo.core.utils.mapper.ModelMapperService;
import com.etiya.ecommerceDemo.entities.concretes.Supplier;
import com.etiya.ecommerceDemo.repositories.abstracts.SupplierDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SupplierManager implements SupplierService {

    private SupplierDao supplierDao;
    private ModelMapperService modelMapperService;

    @Override
    public List<ListSupplierResponse> getAll() {
        return supplierDao.getAll();
    }

    @Override
    public SupplierDetailResponse getById(Long id) {
        return supplierDao.getOneSupplierById(id);
    }

    @Override
    public AddSupplierResponse addSupplier(AddSupplierRequest addSupplierRequest) throws Exception {
        if (supplierDao.existsSupplierBySupplierName(addSupplierRequest.getSupplierName())) {
            throw new Exception("Girdiğiniz isim zaten mevcut");
        }

        Supplier supplier = this.modelMapperService.getMapper().map(addSupplierRequest, Supplier.class);
        supplierDao.save(supplier);

        AddSupplierResponse addSupplierResponse = this.modelMapperService.getMapper().map(supplier, AddSupplierResponse.class);

        return addSupplierResponse;
    }
}
