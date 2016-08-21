package com.caiyunworks.mangonote.endpoint;

import com.caiyunworks.mangonote.entity.Book;
import com.caiyunworks.mangonote.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Tony Wang on 8/20/16.
 */
@Component
@Path("/book")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class BookEndpoint {
    @Autowired
    private BookRepository bookRepo;

    @PUT
    public Response add() {
        Book book = new Book();
        book.setBookId(1);
        ;
        book.setIsbnNumber(2133443554);
        book.setName("Kane And Abel by XYZ");
        bookRepo.save(book);

        Book anotherBook = new Book();
        anotherBook.setBookId(2);
        ;
        anotherBook.setIsbnNumber(2133443554);
        anotherBook.setName("The Prodigal Daughter");
        bookRepo.save(anotherBook);
        return Response.ok().build();
    }

    @GET
    public Book find() {
        return bookRepo.findOne(1L);
    }
}
