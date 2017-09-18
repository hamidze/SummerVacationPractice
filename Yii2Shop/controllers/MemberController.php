<?php
/**
 * Created by PhpStorm.
 * User: Thpffcj
 * Date: 2017/9/18
 * Time: 20:09
 */
namespace app\controllers;
use app\controllers\CommonController;
use app\models\User;
use Yii;
use yii\web\Controller;

class MemberController extends Controller
{
    public function actionAuth()
    {
        $this->layout = "layout2";
        return $this->render("auth");
    }
}