<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/18
 * Time: 19:36
 */

namespace app\controllers;
use app\controllers\CommonController;
use app\models\User;
use app\models\Cart;
use app\models\Product;
use Yii;
use yii\web\Controller;

class CartController extends Controller
{

    public function actionIndex()
    {
        $this->layout = "layout1";
        return $this->render("index");
    }
}