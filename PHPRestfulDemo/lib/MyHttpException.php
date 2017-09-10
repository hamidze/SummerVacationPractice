<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/9
 * Time: 14:33
 */
class MyHttpException extends Exception
{
    private $statusCode;

    /**
     * HttpException constructor.
     * @param int $statusCode
     * @param string $message
     * @param int $code
     * @param $exception
     */
    public function __construct($statusCode, $message = '', $code = 0, $exception = null)
    {
        parent::__construct($message, $code, $exception);
        $this->statusCode = $statusCode;
    }

    /**
     * @return mixed
     */
    public function getStatusCode()
    {
        return $this->statusCode;
    }
}