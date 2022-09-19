package in.ashokit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionMapper {
@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<String> handleArithmetic(ArithmeticException ae)
{
		System.out.println("********HandleArithmeticException() method called *********");
	return new ResponseEntity<>(ae.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
}
	

}
