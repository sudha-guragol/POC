package in.ashokit.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionMapper {
	
	//predefined exception
@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<String> handleArithmetic(ArithmeticException ae)
{
		System.out.println(" ********HandleArithmeticException() method called ********* ");
	return new ResponseEntity<>(ae.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
}


//custom or user sdefined Exception
@ExceptionHandler(value=NoDataFoundException.class)
	public ResponseEntity<ErrorResponse> handleNodatafoundException(NoDataFoundException ndfe)
	{
		System.out.println("*****NodataFoundException() method called");
		
		ErrorResponse response=new ErrorResponse();
		response.setErrorCode("ERR-102");
		response.setErrorMsg(ndfe.getMessage());
		response.setErrorDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}

}
