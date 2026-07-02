package com.paymentchain.billing.common;

import com.paymentchain.billing.dto.InvoiceRequest;
import com.paymentchain.billing.entities.Invoice;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-02T00:01:46-0600",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.100.v20260624-0231, environment: Java 21.0.11 (Eclipse Adoptium)"
)
@Component
public class InvoiceRequestMapperImpl implements InvoiceRequestMapper {

    @Override
    public Invoice InvoiceRequestToInvoice(InvoiceRequest source) {
        if ( source == null ) {
            return null;
        }

        Invoice invoice = new Invoice();

        invoice.setCustomerId( source.getCustomer() );
        invoice.setAmount( source.getAmount() );
        invoice.setDetail( source.getDetail() );
        invoice.setNumber( source.getNumber() );

        return invoice;
    }

    @Override
    public List<Invoice> InvoiceRequestListToInvoiceList(List<InvoiceRequest> source) {
        if ( source == null ) {
            return null;
        }

        List<Invoice> list = new ArrayList<Invoice>( source.size() );
        for ( InvoiceRequest invoiceRequest : source ) {
            list.add( InvoiceRequestToInvoice( invoiceRequest ) );
        }

        return list;
    }

    @Override
    public InvoiceRequest InvoiceToInvoiceRequest(Invoice source) {
        if ( source == null ) {
            return null;
        }

        InvoiceRequest invoiceRequest = new InvoiceRequest();

        invoiceRequest.setCustomer( source.getCustomerId() );
        invoiceRequest.setAmount( source.getAmount() );
        invoiceRequest.setDetail( source.getDetail() );
        invoiceRequest.setNumber( source.getNumber() );

        return invoiceRequest;
    }

    @Override
    public List<InvoiceRequest> InvoiceListToInvoiceRequestList(List<Invoice> source) {
        if ( source == null ) {
            return null;
        }

        List<InvoiceRequest> list = new ArrayList<InvoiceRequest>( source.size() );
        for ( Invoice invoice : source ) {
            list.add( InvoiceToInvoiceRequest( invoice ) );
        }

        return list;
    }
}
