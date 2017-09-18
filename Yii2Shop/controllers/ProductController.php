<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/18
 * Time: 11:51
 */
namespace app\controllers;

use app\controllers\CommonController;
use Yii;
use app\models\Product;
use yii\data\Pagination;
use yii\web\Controller;

class ProductController extends Controller
{
    public function actionIndex()
    {
        $this->layout = "layout2";
        return $this->render("index");
    }

    public function actionDetail()
    {
        $this->layout = "layout2";
        return $this->render("detail");
    }
}