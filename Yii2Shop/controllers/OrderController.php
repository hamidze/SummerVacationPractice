<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/18
 * Time: 19:59
 */
namespace app\controllers;
use app\controllers\CommonController;
use Yii;
use app\models\Order;
use app\models\OrderDetail;
use app\models\Cart;
use app\models\Product;
use app\models\User;
use app\models\Address;
use app\models\Pay;
use yii\web\Controller;

//use dzer\express\Express;

class OrderController extends Controller
{
    public function actionIndex()
    {
        $this->layout = "layout2";
        return $this->render("index");
    }

    public function actionCheck()
    {
        $this->layout = "layout1";
        return $this->render("check");
    }
}