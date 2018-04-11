package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

import java.util.List;

public interface MultiplicationService {


    Multiplication createRandomMultiplication();


    MultiplicationResultAttempt checkAttempt(final MultiplicationResultAttempt resultAttempt);


    List<MultiplicationResultAttempt> getStatsForUser(final String userAlias);


    MultiplicationResultAttempt getResultById(final Long resultId);

}
