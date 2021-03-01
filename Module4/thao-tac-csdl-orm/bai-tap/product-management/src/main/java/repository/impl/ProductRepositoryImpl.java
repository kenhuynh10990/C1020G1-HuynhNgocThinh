package repository.impl;

import entity.Product;
import org.springframework.stereotype.Repository;
import repository.ProductRepository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public List<Product> findAll() {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery("select s from product s", Product.class);
        return typedQuery.getResultList();
    }

    @Override
    public Product findById(Integer id) {
        return BaseRepository.entityManager.find(Product.class, id);
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();

        entityTransaction.begin();
        if (product.getId() == null) {
            BaseRepository.entityManager.persist(product);
        } else {
            BaseRepository.entityManager.merge(product);
        }
        entityTransaction.commit();

    }

    @Override
    public void delete(Integer id) {
        Product product = BaseRepository.entityManager.find(Product.class, id);
        if (product != null) {
            EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
            entityTransaction.begin();
            BaseRepository.entityManager.remove(product);
            entityTransaction.commit();
        }


    }
}
